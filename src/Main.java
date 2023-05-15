public class Main {
    public static void main(String[] args){
    System.out.println("Trying to play the audio file.");
        AudioFile audio1 = AudioFile.getInstance();
        System.out.println(audio1);
        audio1.setAudioFile("NF - PAID MY DUES");
        System.out.println(audio1.getAudioFile());
        System.out.println("Trying to play another audio file:");
        AudioFile audio2 = AudioFile.getInstance();
        System.out.println(audio2);
        System.out.println(audio2.getAudioFile());
        if (audio1 == audio2){
            System.out.println("Both audio files are the same.");
        }
        audio2.setAudioFile("КОСМОНАВТОВ НЕТ - ДОЖДЕМ");
        System.out.println(audio2.getAudioFile());
        System.out.println(audio2);
        System.out.println(audio1.getAudioFile());
        if (audio1 == audio2){
            System.out.println("Both audio files are the same.");
        }
    }
}

