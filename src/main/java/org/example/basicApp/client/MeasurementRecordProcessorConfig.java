/*
*
* Developed and adpated by Songjie Wang
* Department of EECS
* University of Missouri
*
*/

package org.example.basicApp.client;

// The configuration settings for a MeasurementRecordProcessor
public class MeasurementRecordProcessorConfig {
    // How often to checkpoint
    private long checkpointIntervalInSeconds = 60L;
    // Backoff and retry settings for checkpointing
    private long checkpointBackoffTimeInSeconds = 3L;
    private long checkpointRetries = 10;
    // The initial amount of time to wait after initialize() is called before advancing the interval window.
    private long initialWindowAdvanceDelayInSeconds = 10L;

    public long getCheckpointIntervalInSeconds() {
        return checkpointIntervalInSeconds;
    }

    public void setCheckpointIntervalInSeconds(long checkpointIntervalInSeconds) {
        this.checkpointIntervalInSeconds = checkpointIntervalInSeconds;
    }

    public long getCheckpointBackoffTimeInSeconds() {
        return checkpointBackoffTimeInSeconds;
    }

    public void setCheckpointBackoffTimeInSeconds(long checkpointBackoffTimeInSeconds) {
        this.checkpointBackoffTimeInSeconds = checkpointBackoffTimeInSeconds;
    }

    public long getCheckpointRetries() {
        return checkpointRetries;
    }

    public void setCheckpointRetries(long checkpointRetries) {
        this.checkpointRetries = checkpointRetries;
    }

    public long getInitialWindowAdvanceDelayInSeconds() {
        return initialWindowAdvanceDelayInSeconds;
    }

    public void setInitialWindowAdvanceDelayInSeconds(long initialWindowAdvanceDelayInSeconds) {
        this.initialWindowAdvanceDelayInSeconds = initialWindowAdvanceDelayInSeconds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (checkpointBackoffTimeInSeconds ^ (checkpointBackoffTimeInSeconds >>> 32));
        result = prime * result + (int) (checkpointIntervalInSeconds ^ (checkpointIntervalInSeconds >>> 32));
        result = prime * result + (int) (checkpointRetries ^ (checkpointRetries >>> 32));
        result =
                prime * result
                        + (int) (initialWindowAdvanceDelayInSeconds ^ (initialWindowAdvanceDelayInSeconds >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        MeasurementRecordProcessorConfig other = (MeasurementRecordProcessorConfig) obj;
        if (checkpointBackoffTimeInSeconds != other.checkpointBackoffTimeInSeconds) {
            return false;
        }
        if (checkpointIntervalInSeconds != other.checkpointIntervalInSeconds) {
            return false;
        }
        if (checkpointRetries != other.checkpointRetries) {
            return false;
        }
        if (initialWindowAdvanceDelayInSeconds != other.initialWindowAdvanceDelayInSeconds) {
            return false;
        }
        return true;
    }

}
