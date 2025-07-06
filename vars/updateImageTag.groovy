def call(String fileName, String imageName, String dockerTag){
  def sedCommand = " sed -i -e s|${imageName}|${imageName}:${dockerTag}|g ${fileName}"
  echo  "Executing: ${sedCommand}"
  //sh sedCommand  
}
