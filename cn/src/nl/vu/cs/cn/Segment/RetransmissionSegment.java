package cn.src.nl.vu.cs.cn.Segment;

/**
 * Created by haritha on 8/3/17.
 */

public class RetransmissionSegment {

    private final Segment segment;
    private int retry;

    public RetransmissionSegment(Segment segment) {
        this.segment = segment;
        retry = 0;
    }

    public Segment getSegment () {
        return segment;
    }

    public int getRetry() {
        return retry;
    }

    public void increaseRetry () {
        retry++;
    }
}