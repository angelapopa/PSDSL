/*EC2 instance types reference: https://aws.amazon.com/ec2/instance-types/*/

package uibk.dsl.assignment4

class EC2Instance {
	String name;
	String model;

	public EC2Instance() {
		// TODO Auto-generated constructor stub
	}
	
	def ram(int nrOfRamUnits){
		
	}
	
	def vCPU(int nrOfvCPU) {
		
	}
	
	def CPUCredits(int nrOfCPUCreditPerHour) {
		
	}
	
	def Storage(String StorageName) {
		
	}

	static main(args) {
		def instance1 = new EC2Instance(name: "t2", model: "t2.nano")
		
		def instance2 = new EC2Instance(model: "t2.large")
					.ram(1024).vCPU(1).CPUCredits(36).Storage("EBS-Only");
		
		instance1.run()
		instance2.run()
	}

}
