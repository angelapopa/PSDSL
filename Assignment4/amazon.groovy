def instance1 = new EC2Instance()

def ram(int nrOfRamUnits){
//this_is_just_a_stub
}

def instance2 = new EC2Instance().ram(1024)

instance1.run()
instance2.run()