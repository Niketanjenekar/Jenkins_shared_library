def call() {
    withSonarQubeEnv('sonar-server') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Youtube-clone -Dsonar.projectKey=Youtube-clone '''
    }
}
