def call(String fileName, String imageName, String imageTag){  
  def sedCommand = "sed -i -e 's|${imageName}:.*|${imageName}:${imageTag}|g' ${fileName}"
  echo  "Executing: ${sedCommand}"
 sh "${sedCommand}"  
}
