package Java学习.Java高级.注解和反射.反射.heima.使用Class对象02;

public class Person02{
    private String privateField;
    String defaltField;
    protected String protectField;
    public String publicField;
    public void eat(){
        System.out.println("eat....");
    }
    public void eat(String food){
        System.out.println("eat..."+food);
    }
    public Person02() {
        this.privateField = privateField;
    }

    public Person02(String privateField) {
        this.privateField = privateField;
    }

    @Override
    public String toString() {
        return "Person02{" +
                "privateField='" + privateField + '\'' +
                ", defaltField='" + defaltField + '\'' +
                ", protectField='" + protectField + '\'' +
                ", publicField='" + publicField + '\'' +
                '}';
    }

    public Person02(String privateField, String defaltField, String protectField, String publicField) {
        this.privateField = privateField;
        this.defaltField = defaltField;
        this.protectField = protectField;
        this.publicField = publicField;
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    public String getDefaltField() {
        return defaltField;
    }

    public void setDefaltField(String defaltField) {
        this.defaltField = defaltField;
    }

    public String getProtectField() {
        return protectField;
    }

    public void setProtectField(String protectField) {
        this.protectField = protectField;
    }

    public String getPublicField() {
        return publicField;
    }

    public void setPublicField(String publicField) {
        this.publicField = publicField;
    }
}