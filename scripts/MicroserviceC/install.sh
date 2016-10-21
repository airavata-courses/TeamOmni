echo '===============Building docker===============' >> /var/log/sga-docker.log 2>&1
docker build --build-arg APP_URL=https://s3-us-west-2.amazonaws.com/sga-team-omni/omniStormDetector.tar.gz -t omni/stormDetect:v1 . >> /var/log/sga-docker.log 2>&1
echo '===============Running docker===============' >> /var/log/sga-docker.log 2>&1
docker run -it --name omniStormDetector -h storm.detector -p 8081:8080 -d omni/stormDetect:v1 >> /var/log/sga-docker.log 2>&1