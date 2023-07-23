package cn.ks.kd.headfirst;

import javax.sound.midi.*;

public class MiniMusicPlayer1 {
    public static void main(String[] args) {
        try {
            Sequencer sequ = MidiSystem.getSequencer();
            sequ.open();

            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track tck = seq.createTrack();
            for(int i=5; i<61; i+=4){
                tck.add(makeEvent(144,1,i,100,i));
                tck.add(makeEvent(128,1,i,100,i+2));
            }
            sequ.setSequence(seq);
            sequ.setTempoInBPM(220);
            sequ.start();
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
    public static MidiEvent makeEvent(int comd, int chan,int one,int two,int tick){
        MidiEvent event = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(comd,chan,one,two);
            event = new MidiEvent(a,tick);

        }catch(Exception e){
            e.printStackTrace();
        }

        return event;

    }
}
