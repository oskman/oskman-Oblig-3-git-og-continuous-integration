# oskman-Oblig-3-git-og-continuous-integration
Først lastet jeg opp alle prosjekt filene ved hjelp av git bash, så satt jeg opp en action som kjøres hver gang noen pusher filer til reposytoriet. Denne actionen inneholder en job. Denne job-en setter opp JDK og lager en build av prosjektet. 
Når builden blir laget -
kan man se kjøringen av testene under actions/BuildProject_RunTests og klikker på "Create the build with gradle". Her er et utklipp av output:
> Task :test

testAlgorithm > Should check if the year divided by 4 is not an int PASSED

testAlgorithm > Should check if the year divided by 100 is an int and the year divided by 400 is not. PASSED

testAlgorithm > Should check if the year divided by 4 is an int and the year divided by 100 is not. PASSED

testAlgorithm > Should check if the year divided by 400 is an int. PASSED

> Task :check
> Task :build

BUILD SUCCESSFUL in 36s
4 actionable tasks: 4 executed
