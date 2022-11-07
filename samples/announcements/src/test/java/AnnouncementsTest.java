import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.openapitools.client.model.*;
import org.sendbird.client.ApiClient;
import org.sendbird.client.Configuration;


class AnnouncementsTest {


    @Test
    @DisplayName("send announcement")
    void testSendAnnouncement() {
        Announcements announcements = new Announcements();
        announcements.sendAnnouncement();

    }


    @AfterAll
    public static void tearDown() {
        System.out.println("AbstractBaseTest.tearDown");

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-"+Config.appId+".sendbird.com");
        User user = new User(defaultClient);
        GroupChannel groupChannel = new GroupChannel(defaultClient);

        ListUsersResponse users = user.listUsers("SB::test-user::Java::e2e::");
        for (int i = 0; i < users.getUsers().size(); i++) {
            String userIdToDelete = users.getUsers().get(i).getUserId();
            user.deleteUserById(userIdToDelete);
        }

        GcListChannelsResponse groupChannelResponse = groupChannel.listChannels("SB::test-gc::Java::e2e::");
        System.out.println(groupChannelResponse);

        for (int i = 0; i < groupChannelResponse.getChannels().size(); i++) {
            String channelUrlToDelete = groupChannelResponse.getChannels().get(i).getChannelUrl();
            groupChannel.deleteChannelByUrl(channelUrlToDelete);
        }

    }



}