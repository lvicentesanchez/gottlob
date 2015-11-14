val main =
  project.in(file(".")).settings(
    fregeOptions := Seq("-O")
  )
