
package netbeans.bewarethekraken;

/**
 *
 * @author halfrikan
 */
public class BewareTheKraken {

    public static void main(String[] args) {
        System.out.println("Get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooooOOOOooo!");
        
        int depthDivedInFt = 0;
        
        //turns out the ocean is only so deep, 36200 at the deepest survey
        //so if we reach the bottom.... we should probably stop
        while ( depthDivedInFt < 36200){
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");
            if (depthDivedInFt >= 20000){
                System.out.println(".... i think i see the Kraken.....");
                System.out.println("TIME TO GO!!");
                break;
            }
            
            // i can swin pretty fast! 1000 feet at a time!
            depthDivedInFt += 1000;
        } 
        System.out.println("");
        System.out.println("we ended up swimming " + depthDivedInFt + " feet down");
    }
}
