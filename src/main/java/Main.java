import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> estoque = new ArrayList<>();

        estoque.add("Cabo");
        estoque.add("fermento");
        estoque.remove(estoque.get(1));
        for (int i = 0; i < estoque.size(); i++){
            System.out.println(estoque.get(i));
        }
    }
}
