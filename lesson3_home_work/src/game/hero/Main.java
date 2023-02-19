package game.hero;

public class Main {

    public static void main(String[] args) {

        Elf heroElf = new Elf(1, 12, 13, 14, 15, 16);


        Elf elf = new Elf();
        elf.setId(5);
        System.out.println(elf.getId());
    }
}
