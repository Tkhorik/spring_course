    package com.example.spring_course.hibernet.hibernet_one_to_many.entity;

    import javax.persistence.*;
    import java.util.ArrayList;
    import java.util.List;

    @Entity
    @Table(name = "section")
    public class Section {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "name")
        private String name;

        @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                CascadeType.DETACH, CascadeType.REFRESH})
        @JoinTable(name = "child_section",
                joinColumns = @JoinColumn(name = "child_id"),
                inverseJoinColumns = @JoinColumn(name = "section_id"))
        private List<Child> children;

        public void addChildeToSection(Child child) {
            if (children == null) {
                children = new ArrayList<>();
            }
            children.add(child);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Child> getChildren() {
            return children;
        }

        public void setChildren(List<Child> children) {
            this.children = children;
        }

        public Section() {
        }

        public Section(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Section{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }