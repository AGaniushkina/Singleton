public class AudioFile {
    private static AudioFile instance;
    private static String audioFile;

    private AudioFile() {
    }

    public static synchronized AudioFile getInstance() { // #3
        if (instance == null) {        //если объект еще не создан
            instance = new AudioFile();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }
    public static String getAudioFile() {
        return audioFile;
    }
}
