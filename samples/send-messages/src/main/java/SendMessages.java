import org.openapitools.client.model.ListMessagesResponse;
import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.util.ArrayList;
import java.util.List;

public class SendMessages {
    public void sendMessage(){

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);
        Message message = new Message(defaultClient);

        SendBirdUser createUserResultA = user.createUser();
        SendBirdUser createUserResultB = user.createUser();

        List<String> userIds=new ArrayList<String>();
        userIds.add(createUserResultA.getUserId());
        userIds.add(createUserResultB.getUserId());

        SendBirdGroupChannel createChannelResult = groupChannel.createChannel(userIds);
        List<String> targetList=new ArrayList<String>();
        targetList.add(createChannelResult.getChannelUrl());
        // active premium in Sendbird dashboard
        message.sendMessage("group_channels",createChannelResult.getChannelUrl(),createUserResultA.getUserId(), "yo", "MESG");

        ListMessagesResponse listMessagesResult = message.listMessages(createChannelResult.getChannelUrl());

    }

    public void  sendFileMessage(){

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);
        Message message = new Message(defaultClient);

        SendBirdUser createUserResultA = user.createUser();
        SendBirdUser createUserResultB = user.createUser();

        List<String> userIds=new ArrayList<String>();
        userIds.add(createUserResultA.getUserId());
        userIds.add(createUserResultB.getUserId());

        SendBirdGroupChannel createChannelResult = groupChannel.createChannel(userIds);
        List<String> targetList=new ArrayList<String>();
        targetList.add(createChannelResult.getChannelUrl());
        // active premium in Sendbird dashboard
        SendBirdMessageResponse result = message.sendFileMessage("group_channels",createChannelResult.getChannelUrl(),createUserResultA.getUserId(), "yo", "FILE");

        System.out.println("send announcment");

    }
}
