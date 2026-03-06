@Configuration
public class FirebaseConfig {
    @PostConstruct
    public void initialize() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("src/main/resources/service-account.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://your-project-id.firebaseio.com")
            .build();

        FirebaseApp.initializeApp(options);
    }
}
