package rgms.tool

public class FacebookTool {

	static facebookHistory = []

    public static void sendGFacebook(String articleName, String currentStatus){
        facebookHistory.add([articleName : articleName, status : currentStatus])
    }

    static public boolean consult(String articleName) {
        def facebookFound = facebookHistory.find { articleNameTwitter ->
            articleNameTwitter.articleName == articleName
        }
        if (facebookFound == null){
            return false
        }
        facebookFound?.status != 0
    }

}