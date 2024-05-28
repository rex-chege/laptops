class Working {
    String fname = "harrison";
    String lname = "chege";

    public static void main(String[] args) {
        Working myObjc = new Working();
        {
            System.out.println("message:" + myObjc.fname);
            System.out.println("updated:" + myObjc.lname);
        }
    }
}