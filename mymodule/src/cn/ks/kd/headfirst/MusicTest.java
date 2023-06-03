package cn.ks.kd.headfirst;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

import static java.lang.System.out;
public class MusicTest {
    public void play(){
        try {
            Sequencer seq = MidiSystem.getSequencer();
        }catch (MidiUnavailableException ex) {
            out.println(ex.toString());

        }
        out.println("we had a sequencer");

    }
  
    public static void main(String[] args) {
        MusicTest mt = new MusicTest();
        mt.play();


    }
}
