import java.util.Date;

public class Proposal {
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status = StatusProposal.Waiting;

    public Proposal(String proposal_code, String proposal_title,
                    String proposal_text, Date proposal_date) {
        this.proposal_code = proposal_code;
        this.proposal_title = proposal_title;
        this.proposal_text = proposal_text;
        this.proposal_date = proposal_date;
    }

    public void viewProposal() {
        System.out.println("View proposal");
    }

    public void viewStatus() {
        System.out.println("Status : " + proposal_status);
    }

    public void updateProposal() {
        System.out.println("Update proposal");
    }

    public void deleteProposal() {
        System.out.println("Delete proposal");
    }

    public void archiveProposal() {
        System.out.println("Archive proposal");
    }

    public void viewApplicant() {
        System.out.println("View applicant");
    }

    public void changeStatus(StatusProposal status) {
        this.proposal_status = status;
    }
}