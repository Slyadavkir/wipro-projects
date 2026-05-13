// We use < > to specify Parameter type
class Test<T> {

    T obj;
    Test(T obj) { 
        this.obj = obj;
    }
    public T getObject() { return this.obj; }
}

class Generic {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(35);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj
            = new Test<String>("GenericForpractice");
        System.out.println(sObj.getObject());
    }
}