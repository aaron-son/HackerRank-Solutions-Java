class HelloWorld {

    public static String stringReverse(String string){


        char[] array = string.toCharArray();

        String concat = "";
        for(int i=0; i < array.length; i++){
            concat += Character.toString(array[array.length-i-1]);
        }
        return concat;
    }
    public static void main(String args[]) {
        String collection = "Hello world - Java!";
        System.out.println(stringReverse(collection));
    }
}
