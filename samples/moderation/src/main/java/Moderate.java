import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Moderate {
    public void freezeChannel(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);
        Moderation moderation = new Moderation(defaultClient);


        SendBirdUser createUserResultA = user.createUser();
        SendBirdUser createUserResultB = user.createUser();

        List<String> userIds=new ArrayList<String>();
        userIds.add(createUserResultA.getUserId());
        userIds.add(createUserResultB.getUserId());

        SendBirdGroupChannel createChannelResult = groupChannel.createChannel(userIds);
        moderation.freezeChannel(createChannelResult.getChannelUrl());

    }

    public void reportMessage(){
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);
        Message message = new Message(defaultClient);
        Report report = new Report(defaultClient);

        SendBirdUser createUserResultA = user.createUser();
        SendBirdUser createUserResultB = user.createUser();

        List<String> userIds=new ArrayList<String>();
        userIds.add(createUserResultA.getUserId());
        userIds.add(createUserResultB.getUserId());

        SendBirdGroupChannel createChannelResult = groupChannel.createChannel(userIds);
        List<String> targetList=new ArrayList<String>();
        targetList.add(createChannelResult.getChannelUrl());
        // active premium in Sendbird dashboard
        SendBirdMessageResponse sendMessageResult = message.sendMessage("group_channels",createChannelResult.getChannelUrl(),createUserResultA.getUserId(), "yo", "MESG");


        ReportMessageByIdResponse reportMessageResult = report.reportMessageById(sendMessageResult.getMessageId().toString(), createChannelResult.getChannelUrl(), createUserResultA.getUserId());
        ListReportsOnChannelByUrlResponse result = report.listReportsOnChannelByUrl(createChannelResult.getChannelUrl());
    }
}
