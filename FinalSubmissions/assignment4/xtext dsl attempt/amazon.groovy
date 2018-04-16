def cpu(int units){
	//this is just a method stub
}

def ram(int units){
	//this is just a method stub
}

def instance1 = new EC2Instance().cpu(2)
def instance2 = new EC2Instance().ram(1024).cpu(4)

instance1.run()
instance2.run()