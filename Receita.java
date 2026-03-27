


//atividade 06 Receita
public class Receita {
    String data;
    String descritivo;

    public Receita(String data, String descritivo) {
        this.data = data;
        this.descritivo = descritivo;
    }

    public void preescrever(){};
    public void consultar(){}
   
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) throws Exception 
    {
         if(descritivo==null || descritivo.length()<=0)
            throw new Exception("Informe o descritvo do exame");
     
        this.descritivo = descritivo;
    }

    public Receita() {
    }

   
    public void mostrar() {
        var s = "Receita [ getData()=" + getData() + ", getDescritivo()="
                + getDescritivo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
        System.out.println(s);
    };

    public class Receita {
    public void prescrever() {
        System.out.println("Receita prescrita");
    }
    }

    public class Receita{
            public void preescrever(){
                System.ou.printI("Receita enviada ");
            }
            System.out.println(s);
        }
        


    
}
