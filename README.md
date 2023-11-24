![Sendbird banner image](http://ww1.prweb.com/prfiles/2021/09/14/18371217/Sendbird_Logo_RGB_lg.png)

# [Sendbird Java Platform SDK](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api)


[![link to docs](https://img.shields.io/badge/SDK-docs-green)](/docs)

This is a Java library that makes talking to the [Sendbird Platform API](https://sendbird.com/docs/chat/v3/platform-api/getting-started/prepare-to-use-api) easier. With this library you can extend your Sendbird integration to include advanced features like channel automation and user management.

# 🔥 Quick start

```java

import org.sendbird.client.ApiClient;
import org.sendbird.client.ApiException;
import org.sendbird.client.Configuration;
import org.sendbird.client.api.UserApi;
import org.openapitools.client.model.ListUsersResponse;


class AppTest {
    static class User {
        UserApi apiInstance;
        public User(ApiClient defaultClient){
            apiInstance = new UserApi(defaultClient);
        }
        public void listUsers(){

            try {
                Integer limit = 56;
                String activeMode = "activated";
                Boolean showBot = true;
                ListUsersResponse result = apiInstance.listUsers().limit(limit).activeMode(activeMode).execute();
                System.out.println(result);

            } catch (ApiException e) {
                System.err.println("Exception when calling listUsers");
                System.err.println("Status code: " + e.getCode());
                System.err.println("Reason: " + e.getResponseBody());
                System.err.println("Response headers: " + e.getResponseHeaders());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String apiToken = "YOUR_API_TOKEN";
        String applicationId = "YOUR_APP_ID_FROM_DASHBOARD";
        ApiClient defaultClient = Configuration.getDefaultApiClient().addDefaultHeader("Api-Token", apiToken);
        defaultClient.setBasePath("https://api-" + applicationId + ".sendbird.com");
        User user = new User(defaultClient);
        user.listUsers();
    }
}

```

# ⚒️ Prerequisite
In order to make requests with this SDK you will need you master API token. This can be found through the [Sendbird dashboard](https://dashboard.sendbird.com/).  Each app you create in Sendbird has its own master api token. These tokens can be found in Settings > Application > General.

![how to find you api token](https://i.imgur.com/0YMKtpX.png)

## 💻 Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven (3.8.3+)/Gradle (7.2+)

## ⚙️ Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add these dependency to your project's POM:

```xml
<dependencies>
    <dependency>
        <groupId>org.sendbird</groupId>
        <artifactId>sendbird-platform-sdk</artifactId>
        <version>1.0.20</version>
    </dependency>
</dependencies>
```

### Gradle users

Add this dependency to your project's build file:

```groovy

dependencies {
    implementation "org.sendbird:sendbird-platform-sdk:1.0.20"
}

allprojects {
    repositories {
        maven { url "https://repo.sendbird.com/public/maven" }
    }
}
```





# 🗃️ Documentation 
All the documentation for this project lives in the /docs directory of this repo. 

##### Helpful links

|       | Documentation |
| ----------- | ----------- |
| Announcement   | [docs/AnnouncementApi.md](docs/AnnouncementApi.md)|
| Application | [docs/ApplicationApi.md](docs/ApplicationApi.md)  |
| Bot | [docs/BotApi.md](docs/BotApi.md)  |
| GroupChannel | [docs/GroupChannelApi.md](docs/GroupChannelApi.md)  |
| Message | [docs/MessageApi.md](docs/MessageApi.md)  |
| OpenChannel | [docs/OpenChannelApi.md ](docs/OpenChannelApi.md)  |
| User | [docs/UserApi.md](docs/UserApi.md)  |
| Webhooks | [docs/WebhooksApi.md](docs/WebhooksApi.md)  |


