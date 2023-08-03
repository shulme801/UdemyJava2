public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Bill";
                        case 3 -> "Jane";
                        case 4 -> "Tim";
                        case 5 -> "Ursula";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java MasterClass");
        }



    }
}
