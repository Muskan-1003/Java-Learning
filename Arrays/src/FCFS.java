import java.util.Scanner;

class Process {
    String name;
    int arrivalTime;
    int burstTime;
    int completionTime;
    int waitingTime;
    int turnaroundTime;

    public Process(String name, int arrivalTime, int burstTime) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

public class FCFS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        Process[] processes = new Process[numProcesses];

        // Input process details
        for (int i = 0; i < numProcesses; i++) {
            System.out.println("\nEnter details for Process " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Arrival Time: ");
            int arrivalTime = scanner.nextInt();
            System.out.print("Burst Time: ");
            int burstTime = scanner.nextInt();

            processes[i] = new Process(name, arrivalTime, burstTime);
        }

        // Sort processes based on arrival time (FCFS)
        for (int i = 0; i < numProcesses - 1; i++) {
            for (int j = 0; j < numProcesses - i - 1; j++) {
                if (processes[j].arrivalTime > processes[j + 1].arrivalTime) {
                    // Swap processes
                    Process temp = processes[j];
                    processes[j] = processes[j + 1];
                    processes[j + 1] = temp;
                }
            }
        }

        calculateCompletionTimes(processes);
        calculateTurnaroundTimes(processes);
        calculateWaitingTimes(processes);

        // Display results
        System.out.println("\nProcess\t Arrival Time\t Burst Time\t Completion Time\t Waiting Time\t Turnaround Time");
        for (Process process : processes) {
            System.out.printf("%-10s\t%-15d\t%-15d\t%-18d\t%-15d\t%-15d\n",
                    process.name, process.arrivalTime, process.burstTime,
                    process.completionTime, process.waitingTime, process.turnaroundTime);
        }

        scanner.close();
    }

    private static void calculateCompletionTimes(Process[] processes) {
        int currentTime = 0;
        for (Process process : processes) {
            currentTime += process.burstTime;
            process.completionTime = currentTime;
        }
    }

    private static void calculateTurnaroundTimes(Process[] processes) {
        for (Process process : processes) {
            process.turnaroundTime = process.completionTime - process.arrivalTime;
        }
    }

    private static void calculateWaitingTimes(Process[] processes) {
        for (Process process : processes) {
            process.waitingTime = process.turnaroundTime - process.burstTime;
        }
    }
}
