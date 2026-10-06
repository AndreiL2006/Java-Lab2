public class Ex1{

    public int rotunjesteNota(int nota){
        if(nota < 38){
            return nota;
        }
        if(nota % 5 >= 3){
            return nota + (5-(nota % 5));
        }
        return nota;
    }

    public static int[] NoteInsuficinte(int[] note){
        int count = 0;
        for(int nota : note){
            if(nota < 40){
                count++;
            }
        }

        int[] insuficinete = new int[count];
        int index = 0;
        for(int nota : note)
    }
}
