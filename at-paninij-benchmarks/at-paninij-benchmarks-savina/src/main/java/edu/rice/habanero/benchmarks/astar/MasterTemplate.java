package edu.rice.habanero.benchmarks.astar;

import org.paninij.lang.Capsule;
import org.paninij.lang.Child;

@Capsule public class MasterTemplate {
    int numWorkers = GuidedSearchConfig.NUM_WORKERS;
    @Child Worker[] workers = new Worker[numWorkers];

    int numWorkSent = 0;
    int numWorkCompleted = 0;
    int numWorkersTerminated = 0;

    public void design(Master self) {
        for (Worker w : workers) w.wire(self);
    }

    public void start() {
        for (Worker w : workers) sendWork(new Work(GuidedSearchConfig.originNode(), GuidedSearchConfig.targetNode()));
    }

    public void sendWork(Work work) {
        int workerIndex = numWorkSent % numWorkers;
        numWorkSent++;
        workers[workerIndex].search(work);
    }

    public void goalReached() {
        for (Worker w : workers) w.done();
    }

    public void workComplete() {
        numWorkCompleted++;
        if (numWorkCompleted == numWorkSent) {
            goalReached();
        }
    }

    public void workerDone() {
        numWorkersTerminated++;
        if (numWorkersTerminated == numWorkers) {
            for (Worker w : workers) w.exit();
        }
    }

}
