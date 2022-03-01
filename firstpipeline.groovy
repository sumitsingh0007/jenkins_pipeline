pipeline{
    agent any
    
    stages{
        stage('compile'){
            steps{
                echo 'compile stage runs.'
            }
        }

        stage('junit'){
            steps{
                echo 'junit stage runs.'
            }
        }

        stage('quality-gate'){
            steps{
                echo 'sonar quality passed stage runs.'
            }
        }

        stage('deploy'){
            steps{
                echo 'deploy stage runs.'
            }
        }
    }

    post{
        always{
            echo 'always run.'
        }

        success{
            echo 'success'
        }

        failure{
            echo 'fail'
        }

        unstable{
            echo 'unstable'
        }

        changed{
            echo 'changed'
        }
    }
}
