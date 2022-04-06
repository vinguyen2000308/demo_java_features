package _1_demo_annotation._3_annotation_processor;


import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes({"demo_annotation._3_annotation_processor.Version"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class VersionProcessor extends AbstractProcessor {
    // A no-args constructor is required for an annotation processor
    public VersionProcessor() {
    }

    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // Process all annotations
        for (TypeElement currentAnnotation : annotations) {
            Name qualifiedName = currentAnnotation.getQualifiedName();
            // check if it is a Version annotation
            if (qualifiedName.contentEquals("demo_annotation._3_annotation_processor.Version")) {
                // Look at all elements that have Version annotations
                Set<? extends Element> annotatedElements;
                annotatedElements = roundEnv.getElementsAnnotatedWith(
                        currentAnnotation);
                for (Element element : annotatedElements) {
                    Version v = element.getAnnotation(Version.class);
                    int major = v.major();
                    int minor = v.minor();
                    if (major < 0 || minor < 0) {
                        // Print the error message
                        String errorMsg = "Version cannot" +
                                " be negative." +
                                " major=" + major +
                                " minor=" + minor;
                        Messager messager = this.processingEnv.getMessager();
                        messager.printMessage(Diagnostic.Kind.ERROR, errorMsg, element);
                    }
                }
            }
        }
        return true;
    }
}