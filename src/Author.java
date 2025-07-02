public class Author {
    private String authorName;
    private String authorLastName;

    public Author(String authorName, String authorLastName) {
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return authorLastName + " " + authorName;
    }

    @Override
    public boolean equals(Object other) {

        if (this.getClass() != other.getClass()) {
            return false;
        } else {
            Author authorEquals = (Author) other;
            return (this.authorName.equals(authorEquals.authorName) && this.authorLastName.equals(authorEquals.authorLastName));

        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorLastName, authorName);
    }
}
