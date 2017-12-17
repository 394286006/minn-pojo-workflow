package p.minn.workflow.entity;

/**
 * 
 * @author minn
 * @QQ:3942986006
 * @comment
 *
 */
// @LogAnnotation
public class ProcessModel {

	private String processid;

	private String model;

	public ProcessModel() {
	}

	public ProcessModel(String processid, String model) {
		super();
		this.processid = processid;
		this.model = model;
	}

	public String getProcessid() {
		return processid;
	}

	public void setProcessid(String processid) {
		this.processid = processid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
