## PullRequestApproverBlogDemo

This is a starter Java project that includes the code required to integrate [SonarQube](https://www.sonarqube.org/) with [AWS CodeCommit approval rules](https://aws.amazon.com/about-aws/whats-new/2019/11/aws-codecommit-enables-enforcing-approval-rule-workflows-for-pull-requests/), and is meant to be used alongside the blog post *Integrating SonarQube as a pull request approver on AWS CodeCommit*. This project builds using [Apache Maven](https://maven.apache.org/).

The project includes an Amazon CloudFormation template to help provision resources for this demo, as well as an AWS CodeBuild buildspec.yml which will facilitate communication betwen your SonarQube instance and AWS CodeCommit.

## Dependencies

- [SonarScanner for Maven](https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/)
- [JUnit](http://junit.sourceforge.net/junit3.8.1/)

## License

This library is licensed under the MIT-0 License. See the LICENSE file.


Container] 2025/10/12 15:45:10.800318 Phase complete: BUILD State: SUCCEEDED
[Container] 2025/10/12 15:45:10.800342 Phase context status code:  Message: 
[Container] 2025/10/12 15:45:10.840652 Entering phase POST_BUILD
[Container] 2025/10/12 15:45:10.842032 Running command sonar_link=$(echo $result | egrep -o "you can browse http://[^, ]+")

[Container] 2025/10/12 15:45:10.851690 Command did not exit successfully sonar_link=$(echo $result | egrep -o "you can browse http://[^, ]+") exit status 1
[Container] 2025/10/12 15:45:10.856415 Phase complete: POST_BUILD State: FAILED
[Container] 2025/10/12 15:45:10.856431 Phase context status code: COMMAND_EXECUTION_ERROR Message: Error while executing command: sonar_link=$(echo $result | egrep -o "you can browse http://[^, ]+"). Reason: exit status 1
[Container] 2025/10/12 15:45:11.049269 Set report auto-discover timeout to 5 seconds
[Container] 2025/10/12 15:45:11.049307 Expanding base directory path:  .
[Container] 2025/10/12 15:45:11.051748 Assembling file list
[Container] 2025/10/12 15:45:11.051763 Expanding .
[Container] 2025/10/12 15:45:11.053956 Expanding file paths for base directory .
[Container] 2025/10/12 15:45:11.053971 Assembling file list
[Container] 2025/10/12 15:45:11.053975 Expanding **/*
[Container] 2025/10/12 15:45:11.060175 Found 48 file(s)
[Container] 2025/10/12 15:45:11.060201 Report auto-discover file discovery took 0.010933 seconds
[Container] 2025/10/12 15:45:11.061149 Phase complete: UPLOAD_ARTIFACTS State: SUCCEEDED
[Container] 2025/10/12 15:45:11.061168 Phase context status code:  Message: 

