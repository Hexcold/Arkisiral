/*
 * @author hexcold || (@henrq.p)
 */

package logic.story;

public class FullStory {
    
    private static boolean fullStory;
    
    public FullStory() {
        FullStory.fullStory = false;
    }
    
    public void setChecker(boolean checker){
        FullStory.fullStory = checker;
    }

    public static boolean getChecker(){
        return FullStory.fullStory;
    }
}

