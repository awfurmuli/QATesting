pipeline{
	agent any
stages{
	stage('compile stage'){
	
		steps{
			withMaven(maven :'maven_4.0.0'){
			sh 'mv clean compile'
			
			}
		}
	
	}
	
	stage('Testing Stage') {
	
		steps{
				withMaven(maven :'maven_4.0.0'){
			sh 'mv test'
			
			}
		}
	
	}
		
	stage('Deployment Stage') {
		
			steps{
					withMaven(maven :'maven_4.0.0'){
				sh 'mv deploy'
				
				}
			}
		
		}










}


}