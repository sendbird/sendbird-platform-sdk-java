import org.openapitools.client.model.GcViewNumberOfEachMembersUnreadMessagesResponse;
import org.openapitools.client.model.SendBirdGroupChannel;
import org.openapitools.client.model.SendBirdMessageResponse;
import org.openapitools.client.model.SendBirdUser;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MessageCount {
    public BigDecimal countUnreadMessages(){
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
        SendBirdMessageResponse result = message.sendMessage("group_channels",createChannelResult.getChannelUrl(), createUserResultB.getUserId(), "yo", "MESG");
        GcViewNumberOfEachMembersUnreadMessagesResponse unreadMessages = message.membersUnreadMessageCount(createChannelResult.getChannelUrl(), createUserResultA.getUserId());

        System.out.println(unreadMessages);
        return  unreadMessages.getUnread().get(createUserResultA.getUserId());
    }
}
