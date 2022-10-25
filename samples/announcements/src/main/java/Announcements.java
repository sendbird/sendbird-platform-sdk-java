import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Announcements {
    public void  sendAnnouncement(){

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);
        Announcement announcement = new Announcement(defaultClient);

        SendBirdUser createUserResultA = user.createUser();
        SendBirdUser createUserResultB = user.createUser();

        List<String> userIds=new ArrayList<String>();
        userIds.add(createUserResultA.getUserId());
        userIds.add(createUserResultB.getUserId());

        SendBirdGroupChannel createChannelResult = groupChannel.createChannel(userIds);
        List<String> targetList=new ArrayList<String>();
        targetList.add(createChannelResult.getChannelUrl());
        // active premium in Sendbird dashboard
        announcement.scheduleAnnouncement("Test", "ADMM", createUserResultA.getUserId(), "Test", "target_channels", targetList, "all");
    }
}
