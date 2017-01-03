package C12Generics;

import java.util.List;

public interface IContain<T> {
    boolean Contains(T obj);
}


class Container<T> implements IContain<T>{

    List<T> _objects;

    
    Container(List<T> ob){
        _objects = ob;   
    }
    
    @Override
    public boolean Contains(T obj) {
        for(T x: _objects)
            if (x.equals(obj))
                return true;
        return false;       
    }
}