# PSDSL

Project name: Oscillator Harmonic Simulation 
Level: Final Project
Author: Nga Pham, Angela Popa

# Getting started

Please edit data on file "synthesizerEditor.dsl" and run "main.groovy". The data values will be automatically stored and added to the project, and the application will run as Java Applet.

# Deployment
## DSL

DSL Editor: synthesizerEditor.dsl
DSL Grammar: synthesizerGrammar.groovy
DSL Validator (at compile-time): SynthesizerValidator.groovy

## Implementation

Transform the data made by user into JSON: TransformToSynthesizerData.groovy

The program works as wrapper taking JSON database and simulating the Oscillator Harmonic base on JSyn Arithmetic Function and some Filters: HarmonicsSynthesizerWrapper.groovy
## References


