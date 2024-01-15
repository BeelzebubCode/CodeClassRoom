package Lab3;
class Lab3Task1 {
    public static void main(String[] args) {
        
        String[] friends = {"Joe","Ray","Sam","Paul"};
        int[] ages = {20,21,19,21};
        int bestFriend = 2;

        System.out.println(friends[0]); // Joe
        System.out.println(friends[bestFriend]); // Sam
        System.out.println(ages[bestFriend]); // 19

        for(int i = 0; i < friends.length; i++){
            System.out.print(friends[i]+" ");
        }
        // Joe Ray Sam Paul

        System.out.println();
        int sum = 0;
        for(int i = 0; i < ages.length; i++){
            sum = sum + ages[i];
        }
        System.out.println("Total age is "+sum);
        // Total age is 81
    }
}