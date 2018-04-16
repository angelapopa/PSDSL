/* This is groupwork of Nga Pham and Angela Popa */
/* EC2 instance types reference: https://aws.amazon.com/ec2/instance-types/*/

package uibk.dsl.assignment4

class EC2Instance {
	String name;
	String model;
	String memory;
	int nrOfvCPU;
	int CPU_credit;

	public EC2Instance() {
		// TODO Auto-generated constructor stub
	}
	
	EC2Instance model(String size) {
		model = name + "." + size
		return this
	}
	
	EC2Instance ram(float nrOfRamUnits) {
		memory = nrOfRamUnits + "GiB"
		return this
	}
	
	EC2Instance vCPU(int nr) {
		nrOfvCPU = nr
		return this
	}
	
	EC2Instance CPUCredits(int nrOfCPUCreditPerHour) {
		CPU_credit = nrOfCPUCreditPerHour
		return this
	}
	
	void run() {
		println("Model\tvCPU\tCPU Credits/hour\tMem (GiB)")
		println(model + '\t' + nrOfvCPU + '\t' + CPU_credit + '\t' + memory)
	}

	static main(String args ) {
		def instance_list = (1..3).collect{new EC2Instance(name: "t2")}		
		
		def instance2 = new EC2Instance(name: "m5").model("large").ram(8).vCPU(2);
		
		instance_list.each{instance -> instance.run()}
		instance2.run();
	}

}
