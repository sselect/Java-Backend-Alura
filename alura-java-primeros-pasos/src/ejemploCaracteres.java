public class ejemploCaracteres {

    public static void main(String[] args) {

        char caracter = 'a';
        System.out.println(caracter);

        caracter = 44;
        System.out.println(caracter);

        caracter = 65 + 1;
        char segundoCaracter =(char) (caracter + 1);
        System.out.println(segundoCaracter);

        String palabra = "Alura, estoy aprendiendo JAVA";
        System.out.println(palabra);

        palabra = palabra + "2023";
        System.out.println(palabra);
    }
}
