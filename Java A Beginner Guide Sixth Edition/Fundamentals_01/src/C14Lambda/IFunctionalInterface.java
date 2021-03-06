package C14Lambda;

import java.io.IOException;


//A functional interface is an interface that contains one and only one abstract method. 
//Normally, this method specifies the intended purpose of the interface. Thus, a functional 
//interface typically represents a single action.
interface IMyvalue{
    double GetValue() throws IOException;
}

interface IMyvalue2{
    double GetValue(double x);
}

interface IMyvalue3{
    double GetValue(double x, double y);
}