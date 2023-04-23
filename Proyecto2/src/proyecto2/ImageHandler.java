package proyecto2;
import java.io.*;

/**

**/
public abstract class ImageHandler {
    
	/* NO CAMBIE ESTE CODIGO */
	/**
	*	Represents the file name of the original file being handled by this class
	**/
	protected String handledFileName;

	/**
	*	Represents the file path of the original file being handled by this class
	**/
	protected String handledFilePath;
	
	/**
	*	Builds and returns an ImageHandler subclass type object which handles the file 
	* 	represented by the given name
	*	@param filename Name of the original file being handled by this object
	**/
	public ImageHandler(String filename, String filepath) {
		this.handledFileName = filename;
        this.handledFilePath = filepath;
	}

	/**
	*	Return the name of the original file being handled by this object 
	*	@return filename Name of the original file being handled by this object
	**/
	public final String getFileName() {
		return this.handledFileName;
	}

	/**
	*	Return the name of the original file being handled by this object 
	*	@return filename Path of the original file being handled by this object
	**/
	public final String getFilePath() {
		return this.handledFilePath;
	}

	/**
	*	Reads handled file header and data in bytes
	**/
	public abstract void readFile() throws Exception;

	/**
	*	Generates all files from the original file. Generated files depend on
	* 	the specific function of the ImageHandler subclass type
	**/
	public abstract void generateFiles() throws Exception;
}