enablePlugins(org.nlogo.build.NetLogoExtension, org.nlogo.build.ExtensionDocumentationPlugin)


name := "gis"
version := "1.3.1"
isSnapshot := true

javaSource in Compile := baseDirectory.value / "src" / "org"
javacOptions ++= Seq("-g", "-deprecation", "-Xlint:all", "-Xlint:-serial", "-Xlint:-path", "-encoding", "us-ascii", "--release", "11")

scalaVersion := "2.12.12"
scalaSource in Test := baseDirectory.value / "src" / "test"
scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-feature", "-encoding", "us-ascii", "-release", "11")

netLogoVersion := "6.2.2"
netLogoClassManager := "org.myworldgis.netlogo.GISExtension"
netLogoTestExtras += (baseDirectory.value / "examples")

libraryDependencies ++= Seq(
  "com.vividsolutions"         % "jts"                % "1.13",
  "commons-httpclient"         % "commons-httpclient" % "3.1",
  "commons-logging"            % "commons-logging"    % "1.2",
  "commons-codec"              % "commons-codec"      % "1.10",
  "org.ngs"                    % "ngunits"            % "1.0.0" from "https://s3.amazonaws.com/ccl-artifacts/ngunits-1.0.jar",
  "javax.media"                % "jai_core"           % "1.1.3" from "https://s3.amazonaws.com/ccl-artifacts/jai_core-1.1.3.jar",
  "com.sun.media"              % "jai_codec"          % "1.1.3" from "https://s3.amazonaws.com/ccl-artifacts/jai_codec-1.1.3.jar",
  "org.tinfour"                % "TinfourCore"        % "2.1.5",
  "com.googlecode.json-simple" % "json-simple"        % "1.1.1")
