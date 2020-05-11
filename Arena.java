public class Arena {

    public static void main(String[] args) {

        Monster monsterOne = new Monster("Monster One", 100, 20);
        Monster monstertwo = new Monster("Monster Two", 80, 20);


        while (monsterOne.getLife() > 0 || monstertwo.getLife() > 0) {
            System.out.println(monsterOne.attack(monstertwo));
            System.out.println(monsterOne.attack(monsterOne));

            if (monsterOne.getLife() <= 0 || monstertwo.getLife() <= 0 ) {
                break;
            }
        }
    }
}