package C08PackagesAndInterfaces;

/**
Variables can be declared in an interface, but they are implicitly public, static, and final.
* To define a set of shared constants, create an interface that contains only these constants, 
* without any methods. Each file that needs access to the constants simply “implements” the 
* interface.
* DO NOT USE: bad practice
 */
public interface IConstant {
    int MIN = 1;
    int MAX = 101;
    String ERROR = "Out of bounds";
}
